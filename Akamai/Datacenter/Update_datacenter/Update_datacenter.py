
from urllib2 import Request, urlopen

values = """
  {
    "city": "Downpatrick",
    "cloneOf": 0,
    "continent": "EU",
    "country": "GB",
    "datacenterId": 3133,
    "defaultLoadObject": {
      "loadObject": null,
      "loadObjectPort": 0,
      "loadServers": null
    },
    "latitude": 54.367,
    "longitude": -5.582,
    "nickname": "Winterfell"
  }
"""

headers = {
  'Content-Type': 'application/json'
}
request = Request('http://private-anon-022f9273e-akamaiopen2lunaconfiggtmproduction.apiary-mock.com/config-gtm/v1/domains/example.akadns.net/datacenters/1', data=values, headers=headers)
request.get_method = lambda: 'PUT'

response_body = urlopen(request).read()
print response_body
