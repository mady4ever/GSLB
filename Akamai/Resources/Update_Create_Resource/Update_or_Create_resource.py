from urllib2 import Request, urlopen

values = """
  {
    "aggregationType": "latest",
    "constrainedProperty": "mail",
    "decayRate": null,
    "description": "Disk utilization",
    "hostHeader": null,
    "leaderString": null,
    "leastSquaresDecay": null,
    "loadImbalancePercentage": null,
    "maxUMultiplicativeIncrement": null,
    "name": "disk",
    "resourceInstances": [
      {
        "datacenterId": 3134,
        "loadObject": "/disk",
        "loadObjectPort": 80,
        "loadServers": [
          "1.2.3.9"
        ],
        "useDefaultLoadObject": false
      },
      {
        "datacenterId": 3133,
        "loadObject": "/disk",
        "loadObjectPort": 80,
        "loadServers": [
          "1.2.3.10"
        ],
        "useDefaultLoadObject": false
      }
    ],
    "type": "XML load object via HTTP",
    "upperBound": 0
  }
"""

headers = {
  'Content-Type': 'application/json'
}
request = Request('http://private-anon-022f9273e-akamaiopen2lunaconfiggtmproduction.apiary-mock.com/config-gtm/v1/domains/example.akadns.net/resources/cpu', data=values, headers=headers)
request.get_method = lambda: 'PUT'

response_body = urlopen(request).read()
print response_body
