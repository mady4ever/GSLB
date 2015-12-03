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

A_srv_name = 'www3.gslb.com'

arecord = { 'fqdn' : 'www3.gslb.com', 'zone' : 'gslb.com', }
print "Deleting A Record"

url = "/REST/ARecord/gslb.com/%s" % A_srv_name

response = api.execute(url,'DELETE',arecord);


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Deleting the Zone failed: %s" % pretty.pformat(response)
    sys.exit(msg)

print "Logging out"
api.execute('/REST/Session/', 'DELETE')
