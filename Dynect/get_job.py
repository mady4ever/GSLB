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

job_id = '1953472563'

jobs = { 'job_id' : '1953472563',}

url = "/REST/Job/%s" % job_id

response = api.execute(url,'GET',jobs);

if response['status'] != 'sucess':
	pretty = PrettyPrinter()
	msg = "Getting the Jobs failed: %s" % pretty.pformat(response)
	sys.exit(msg)

print "logging off"
api.execute('/REST/Session/','DELETE')
