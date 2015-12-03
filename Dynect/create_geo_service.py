#!/usr/bin/env python

"""
Dynect API REST Examples

Logs into the API, creates a brand new Geo Service 
that is linked to one node, deletes the Geo
Service, and then logs out.
"""

from dynect.DynectDNS import DynectRest
from pprint import PrettyPrinter
import sys

api = DynectRest()

# We need to login
print "Logging in to API"

args = {
	'customer_name': 'ciscocloud',
	'user_name': 'UserName',
	'password': 'UserAPIKey',
}

response = api.execute('/REST/Session/', 'POST', args)

if response['status'] != 'success':
	pretty = PrettyPrinter()
	msg = "Login to API failed: %s" % pretty.pformat(response)
	sys.exit(msg)

"""
To create a Geo service, one must specify a unique
name and define at least one Geo Region Group. At
this time, the user can choose whether or not to
link this service to a node.

A Geo Region Group consists of a unique name, a
list of countries that the group represents, and 
rdata that will be served.
"""

svc_name = 'gslb geo'

groups = [{
    'name' : 'gslb group',
    'countries' : ['US'],
    'rdata' : {
        'a_rdata':[{
            'address':'9.9.9.9'
        }]
    }
}]

nodes = [ 
    {'zone': 'gslb.com', 'fqdn': 'gslb.com'},
]

args = { 
    'groups': groups,
    'nodes': nodes
}

print "Creating the Geo Service"
url = "/REST/Geo/%s/" % svc_name
response = api.execute(url, 'POST', args);

if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Creating the Geo Service failed: %s" % pretty.pformat(response)
    sys.exit(msg)

print "Deleting the Geo Service"
url = "/REST/Geo/%s/" % svc_name
response = api.execute(url, 'DELETE');

print "Logging out"
api.execute('/REST/Session/', 'DELETE')
