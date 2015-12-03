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
zones = {
	'rname' : 'www.gslb.com',
	'ttl' : '3600',
	'zone' : 'gslb.com',
}
"""
active_failover_srv = {
	'fqdn' : 'www.gslb.com',
	'address' : '1.2.3.4',
	'failover_mode' : 'ip',
	'failover_data' : '5.5.5.5',
	'auto_recover' : 'Y',
	'contact_nickname' : 'mady',
	'notify_events' : 'ip,svc',
	'monitor' : {
		'protocol' : 'HTTP',
		'interval' : 1,
	},
	'zone' : 'gslb.com',
}

print "Creating the Active Failover Service"
url = "/REST/Failover/gslb.com/www.gslb.com"

response = api.execute(url,'POST', active_failover_srv);


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Creating the AF failed: %s" % pretty.pformat(response)
    sys.exit(msg)

print response['data']

print "Logging out"
api.execute('/REST/Session/', 'DELETE')
