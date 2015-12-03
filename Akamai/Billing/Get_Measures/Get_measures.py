from urllib2 import Request, urlopen

request = Request('http://private-anon-20a31fb7b-akamaiopen2lunabillingusageproduction.apiary-mock.com/billing-usage/v1/measures/productId/reportSourceType/reportSourceId/startMonth/startYear/endMonth/endYear')

response_body = urlopen(request).read()
print response_body
