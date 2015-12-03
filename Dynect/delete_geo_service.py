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

print "Logging in success"
print "geo service name= gslb geo"
svc_name = 'gslb geo'

print "Deleting the Geo Service"
url = "/REST/Geo/%s/" % svc_name
response = api.execute(url, 'DELETE');

print "Logging out"
api.execute('/REST/Session/', 'DELETE')
