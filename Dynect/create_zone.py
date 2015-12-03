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

zone_srv_name = 'gslb.com'
zones = {
	'rname' : 'www.gslb.com',
	'ttl' : '3600',
	'zone' : 'gslb.com',
}

print "Creating the zone gslb.com with rr www.gslb.com"
url = "/REST/Zone/%s" % zone_srv_name

response = api.execute(url,'POST',zones);


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Creating the Zone failed: %s" % pretty.pformat(response)
    sys.exit(msg)

print "Logging out"
api.execute('/REST/Session/', 'DELETE')
