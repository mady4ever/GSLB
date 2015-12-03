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
report_data = {
	'breakdown' : 'zones',
	'end_ts' : '1446535242',
	'rrecs' : [
		'A',
		'!AAAA'
	],
	'start_ts' : '1446163200',
	'zones' : [
		'gslb.com',
	],
}

print "Creating the QPS report"
url = "REST/QPSReport/"

response = api.execute(url,'POST',report_data);


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Creating the QPS report failed: %s" % pretty.pformat(response)
    sys.exit(msg)

print response['data']
print "Logging out"
api.execute('/REST/Session/', 'DELETE')
