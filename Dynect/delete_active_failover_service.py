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


print "Deleting AF Service"

url = "/REST/Failover/gslb.com/www.gslb.com" 

response = api.execute(url,'DELETE');


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Deleting the AF failed: %s" % pretty.pformat(response)
    sys.exit(msg)
print response['data']

print "Logging out"
api.execute('/REST/Session/', 'DELETE')
