from urllib2 import Request, urlopen

values = """
{
    "assignments": [
        {
            "asNumbers": [
                  16625
            ],
            "datacenterId": 3134,
            "nickname": "Frostfangs and the Fist of First Men"
        },
        {
            "asNumbers": [
                12222, 16702, 17334
            ],
            "datacenterId": 3133,
            "nickname": "Winterfell"
        }
    ],
    "defaultDatacenter": {
        "datacenterId": 5400,
        "nickname": "All Other AS Numbers"
    }
    "name": "The North"
}"""

headers = {
  'Content-Type': 'application/vnd.config-gtm.v1.1+json'
}
request = Request('http://private-anon-022f9273e-akamaiopen2lunaconfiggtmproduction.apiary-mock.com/config-gtm/v1/domains/example.akadns.net/as-maps/Software-rollout', data=values, headers=headers)
request.get_method = lambda: 'PUT'

response_body = urlopen(request).read()
print response_body
