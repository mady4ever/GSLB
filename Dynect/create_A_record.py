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

r_srv_name = 'www3.gslb.com'
rdata = { 'address' : '2.2.2.2',}
zones = {
	'fqdn' : 'www3.gslb.com',
	'rdata' : { 'address' : '3.3.3.3',},
	'ttl' : '3600',
	'zone' : 'gslb.com',
}

print "Creating the A record with zone gslb.com with rr www.gslb.com"
url = "/REST/ARecord/gslb.com/%s" % r_srv_name

response = api.execute(url,'POST',zones);


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Creating the A record failed: %s" % pretty.pformat(response)
    sys.exit(msg)

print "Logging out"
api.execute('/REST/Session/', 'DELETE')
