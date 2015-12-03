from urllib2 import Request, urlopen

request = Request('http://private-anon-022f9273e-akamaiopen2lunaconfiggtmproduction.apiary-mock.com/config-gtm/v1/domains/')

response_body = urlopen(request).read()
print response_body
