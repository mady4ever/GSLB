from dynect.DynectDNS import DynectRest
from pprint import PrettyPrinter
import sys

api = DynectRest()

# We need to login
print "url for REST request https://help.dyn.com/create-permissions-group-api/"
print "before using this API make sure you have gslb.com zone created"
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

group_srv_name = 'testgroup'
zones = [{ 'zone_name' : 'abcd.com'},]
groups = {
	'group_name' : 'testgroup',
	'description' : 'This group is created from REST API',
	'zone'	: zones,
}

print "Creating the group testgroup"
url = "/REST/PermissionGroup/%s" % group_srv_name

response = api.execute(url,'POST',groups);


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Creating the group failed: %s" % pretty.pformat(response)
    sys.exit(msg)

print "Logging out"
api.execute('/REST/Session/', 'DELETE')
