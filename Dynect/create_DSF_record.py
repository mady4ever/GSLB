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

r_name = 'www.gslb.com'
record = {
	'label' : 'www record',
	'publish' : 'Y',
}

url = "/REST/DSFRecord/54eHrIuDkcKpg9DdnmrThgpGCsI/%s" % r_name

response = api.execute(url,'POST',record);


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Creating failed: %s" % pretty.pformat(response)
    sys.exit(msg)

print response['data']
print "Logging out"
api.execute('/REST/Session/', 'DELETE')
