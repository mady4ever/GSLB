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

traffic_srv_id = '54eHrIuDkcKpg9DdnmrThgpGCsI'

response_pool= {
	 'label':'AsiaDC',
	 'publish' : 'Y'    # Mahendra - always publish otherwise it will not be seen on the UI, as changes will get discarded.
}
"""
response_pool= {
	'serviceid' : traffic_srv_id,
	'label' : 'Response Pool Created From API',
	'core_set_count' : '1',
	'index' : '2',
	'rs_chains' : [{
		'label' : 'US East - AAAA',
		'rdata_class' : 'AAAA',
		'ttl' : '3600',
		'records' : [{
			'label' : 'USEast007',
			'weight' : '1',
			'automation' : 'auto',
			'endpoints' : ['1.1.1.1' , '2.2.2.2'],
			'endpoint_up_count' : '1',
			'master_line' : '2001:0db8:85a3:0000:0000:8a2e:0370:7334', 
		}],
	}],
}
"""
print "Creating the response pool"
url = "/REST/DSFResponsePool/54eHrIuDkcKpg9DdnmrThgpGCsI/" 

response = api.execute(url,'POST', response_pool);


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Creating failed: %s" % pretty.pformat(response)
    sys.exit(msg)

pretty = PrettyPrinter()
msg = "Printing Response: %s" % pretty.pformat(response)
print msg
print "Logging out"
api.execute('/REST/Session/', 'DELETE')
