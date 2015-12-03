from urllib2 import Request, urlopen

values = """
{
    "assignments": [
        {
            "blocks": [
                "1.3.5.9",
                "1.2.3.0/24"
            ],
            "datacenterId": 3134,
            "nickname": "Frostfangs and the Fist of First Men"
        },
        {
            "blocks": [
                "1.2.4.0/24"
            ],
            "datacenterId": 3133,
            "nickname": "Winterfell"
        }
    ],
    "defaultDatacenter": {
        "datacenterId": 5400,
        "nickname": "All Other CIDR Blocks"
    }
    "name": "The North"
}"""

headers = {
  'Content-Type': 'application/json'
}
request = Request('http://private-anon-022f9273e-akamaiopen2lunaconfiggtmproduction.apiary-mock.com/config-gtm/v1/domains/example.akadns.net/cidr-maps/Software-rollout', data=values, headers=headers)
request.get_method = lambda: 'PUT'

response_body = urlopen(request).read()
print response_body
