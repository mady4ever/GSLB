import sys
from dynect.DynectDNS import DynectRest
from pprint import PrettyPrinter

rest_iface = DynectRest()

# Log in
print "Logging in to API"
arguments = {
    'customer_name': 'ciscocloud',
    'user_name': 'UserName',  
    'password': 'UserAPIKey',
}
# ciscocloud UserName Cisco!gs1b
response = rest_iface.execute('/Session/', 'POST', arguments)

if response['status'] != 'success':
    sys.exit("Incorrect credentials")

# Perform action
print "Get Groups as authentication succeded"

response = rest_iface.execute('/REST/PermissionGroup/', 'GET')
if response['status'] != 'success':
	pretty = PrettyPrinter()
	msg = "Getting Group failed: %s " % pretty.pformat(response)
	sys.exit(msg)

zone_resources = response['data']

print "Getting Groups succeded"
pretty = PrettyPrinter()
print  pretty.pformat(zone_resources)
# Log out, to be polite
print "Deleting session"

rest_iface.execute('/Session/', 'DELETE')
