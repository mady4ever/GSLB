from urllib2 import Request, urlopen

request = Request('http://private-anon-022f9273e-akamaiopen2lunaconfiggtmproduction.apiary-mock.com/config-gtm/v1/domains/example.akadns.net/as-maps/Software-rollout')
request.get_method = lambda: 'DELETE'

response_body = urlopen(request).read()
print response_body
