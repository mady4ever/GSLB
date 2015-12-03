from dynect.DynectDNS import DynectRest
from pprint import PrettyPrinter
import sys

api = DynectRest()

# We need to login
print "before deleting the traffic director service, get service id from the get_traffic_director_service.py"
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

print "deleting service."
traffic_srv_name = 'RWOSBQJ4lp_VtjM5RKMyDV7hu0k'

print "Deleting traffic director service"

url = "/REST/DSF/%s" % traffic_srv_name

response = api.execute(url,'DELETE');


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Deleting the Zone failed: %s" % pretty.pformat(response)
    sys.exit(msg)

print "Logging out"
api.execute('/REST/Session/', 'DELETE')
