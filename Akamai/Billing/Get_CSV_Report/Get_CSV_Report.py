from urllib2 import Request, urlopen

request = Request('http://private-anon-20a31fb7b-akamaiopen2lunabillingusageproduction.apiary-mock.com/billing-usage/v1/contractUsageData/csv')

response_body = urlopen(request).read()
print response_body
