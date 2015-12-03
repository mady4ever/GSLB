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
print "Get response pool as authentication succeded"

r_pool_data = {
	'service_id'	: 'oKodxPBLfY7EDl_KOnSB2pOfYq8',
	'label'	: 'Japan DC',
}
response = rest_iface.execute('/REST/DSFResponsePool/54eHrIuDkcKpg9DdnmrThgpGCsI/', 'GET')
if response['status'] != 'success':
	pretty = PrettyPrinter()
	msg = "Getting response failed: %s " % pretty.pformat(response)
	sys.exit(msg)

zone_resources = response['data']

print zone_resources
# Log out, to be polite
print "Deleting session"

rest_iface.execute('/Session/', 'DELETE')
