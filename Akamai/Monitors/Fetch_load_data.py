from urllib2 import Request, urlopen

request = Request('http://private-anon-4e8d6e137-akamaiopen2mappinggtmloaddataproduction.apiary-mock.com/gtm-load-data/v1/domain/resource/datacenterId')

response_body = urlopen(request).read()
print response_body
