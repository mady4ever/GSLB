from urllib2 import Request, urlopen

values = """
  {
    "city": "Doune",
    "stateOrProvince": "Perthshire",
    "cloneOf": 0,
    "continent": "EU",
    "country": "GB",
    "defaultLoadObject": {
      "loadObject": null,
      "loadObjectPort": 0,
      "loadServers": null
    },
    "latitude": 56.185096,
    "longitude": -4.050264,
    "nickname": "Winterfell"
  }
"""

headers = {
  'Content-Type': 'application/json'
}
request = Request('http://private-anon-022f9273e-akamaiopen2lunaconfiggtmproduction.apiary-mock.com/config-gtm/v1/domains/domain/datacenters', data=values, headers=headers)

response_body = urlopen(request).read()
print response_body
