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
gslb = {
	'rname' : 'www.gslb.com',
	'ttl' : '3600',
	'zone' : 'gslb.com',
}
"""

gslb = {
	'zone' : 'gslb.com',
	'fqdn'	: 'www.gslb.com',
	'contact_nickname' : 'mady',
	'auto_recover' : 'Y',
	'ttl' : 60,
	'notify_events' : 'ip,svc',
	'region' : [
		{
			'region_code' : 'global',
			'failover_mode'	: 'ip',
			'failover_data'	: '127.0.0.1',
			'serve_count' : 1,
			'pool' : [
				{
					'address' : '1.2.3.4',
					'serve_mode' : 'obey',
				},
				{
					'address' : '5.6.7.8',
					'serve_mode' : 'obey',
				},
			],
		},
		{
			'region_code' : 'Asia',
			'pool' : [
				{
					'address' : '5.5.5.5',
				},
			],
		},
	],
	'monitor' : {
		'protocol' : 'HTTP',
		'interval' : 1,
	},
}

print "Creating the GSLB service"
url = "/REST/GSLB/gslb.com/www.gslb.com"

response = api.execute(url,'POST',gslb);


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Creating the GSLB Service failed: %s" % pretty.pformat(response)
    sys.exit(msg)

print "Output from response"
print response['data']
print "Logging out"
api.execute('/REST/Session/', 'DELETE')
