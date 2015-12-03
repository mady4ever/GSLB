from urllib2 import Request, urlopen

values = """
{
    "assignments": [
        {
            "countries": [
                "GB"
            ],
            "datacenterId": 3133,
            "nickname": "UK users"
        }
    ],
    "defaultDatacenter": {
        "datacenterId": 5400,
        "nickname": "Default Mapping"
    }
    "name": "UK Delivery"
}"""

headers = {
  'Content-Type': 'application/json'
}
request = Request('http://private-anon-022f9273e-akamaiopen2lunaconfiggtmproduction.apiary-mock.com/config-gtm/v1/domains/example.akadns.net/geographic-maps/Software-rollout', data=values, headers=headers)
request.get_method = lambda: 'PUT'

response_body = urlopen(request).read()
print response_body
