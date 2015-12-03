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

nodes = [ { 'zone' : 'gslb.com' , 'node' : 'www.gslb.com',}]
criteria = {
	'geoip' : { 'country' : [ 'US' ] }
	}
records = [
{
	'label' : 'USEast007',
	'weight' : '5',
	'automation' : 'auto',
	'endpoints' : ['1.1.1.1' , '2.2.2.2'],
	'endpoint_up_count' : '1',
	'master_line' : '2001:0db8:85a3:0000:0000:8a2e:0370:7334',
}]
record_sets = [
{
	'label' : 'US East - AAAA',
	'rdata_class' : 'AAAA',
	'records' : records,
}]
rs_chains = [
{
	'label' : 'Example Record Set Failover Chain',
	'core' : 'true',
	'record_sets' : record_sets,
}]
response_pools = [
{
	'label' : 'Response Pool Example',
	'core_set_count' : '1',
	'index' : '2',
	'rs_chains' : rs_chains,
}]
rulesets = [{
	'label' : 'Example Ruleset',
	'criteria_type' : 'geoip',
	'criteria' : criteria,
	'response_pools' : response_pools, 
}]
traffic_director_service = {
	'label' : 'TestingService',
	'attached_nodes' : nodes,
}

print "Creating the Traffice management service using REST"
url = "/REST/DSF/"

response = api.execute(url,'POST', traffic_director_service);


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Creating the Zone failed: %s" % pretty.pformat(response)
    sys.exit(msg)

print "Logging out"
api.execute('/REST/Session/', 'DELETE')
