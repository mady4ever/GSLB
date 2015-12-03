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

user_name = 'testuser'

print "Deleting User"

url = "/REST/User/%s" % user_name

response = api.execute(url,'DELETE');


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Deleting the User failed: %s" % pretty.pformat(response)
    sys.exit(msg)

print response['data']
print "Logging out"
api.execute('/REST/Session/', 'DELETE')
