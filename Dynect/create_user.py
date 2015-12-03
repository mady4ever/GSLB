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
user_info = {
        'user_name' : user_name,
	'password' : 'thepass',
	'group_name' : [ 'ADMIN', 'OWNER' ],
	'permission' : [ 'RecordGet', 'RecordUpdate' ],
	'zone' : [
		{
			'zone_name' : 'test.com'
		}, {
			'zone_name' : 'test2.com',
			'recurse' : 'N'
		},
	],
	'forbid' : [
		{
			'name' : 'RecordGet'
		}, {
			'name' : 'RecordUpdate',
			'zone' : [
				{
					'zone_name' : 'test.com',
					'recurse' : 'N'
				},
			],
		},
	],
	'nickname' : 'nick1',
	'first_name' : 'fname1',
	'last_name' : 'lname1,',
	'email' : 'dyn@example.com',
	'notify_email' :'notify@example.com',
	'pager_email' : 'page@example.com',
	'address' : 'address1',
	'address_2' : 'address2',
	'city' : 'Manchester',
	'state' : 'NH',
	'post_code' : '03103',
	'country' : 'US',
	'phone' : '5554445555',
	'fax' : '5557775555',
	'website' : 'http://www.dyn.com',
	'organization' : 'Dynamic Network Services, Inc.',
}

print "Creating the User"
url = "/REST/User/%s" % user_name

response = api.execute(url,'POST', user_info);


if response['status'] != 'success':
    pretty = PrettyPrinter()
    msg = "Creating the User failed: %s" % pretty.pformat(response)
    sys.exit(msg)

print response['data']

print "Logging out"
api.execute('/REST/Session/', 'DELETE')
