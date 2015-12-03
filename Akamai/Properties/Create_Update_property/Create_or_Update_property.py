from urllib2 import Request, urlopen

values = """
  {
    "balanceByDownloadScore": false,
    "failbackDelay": 0,
    "failoverDelay": 0,
    "handoutMode": "normal",
    "healthMax": null,
    "healthMultiplier": null,
    "healthThreshold": null,
    "ipv6": false,
    "livenessTests": [
      {
        "disableNonstandardPortWarning": false,
        "hostHeader": "foo.example.com",
        "httpError3xx": true,
        "httpError4xx": true,
        "httpError5xx": true,
        "name": "health-check",
        "requestString": null,
        "responseString": null,
        "sslClientCertificate": null,
        "sslClientPrivateKey": null,
        "testInterval": 60,
        "testObject": "/status",
        "testObjectPassword": null,
        "testObjectPort": 80,
        "testObjectProtocol": "HTTP",
        "testObjectUsername": null,
        "testTimeout": 25
      }
    ],
    "mxRecords": [],
    "name": "origin",
    "scoreAggregationType": "mean",
    "staticTTL": 600,
    "stickinessBonusConstant": 0,
    "stickinessBonusPercentage": 0,
    "trafficTargets": [
      {
        "datacenterId": 3134,
        "enabled": true,
        "servers": [
          "1.2.3.5"
        ],
        "weight": 50
      },
      {
        "datacenterId": 3133,
        "enabled": true,
        "servers": [
          "1.2.3.4"
        ],
        "weight": 50
      }
    ],
    "type": "weighted-round-robin",
    "useComputedTargets": false
  }
"""

headers = {
  'Content-Type': 'application/json'
}
request = Request('http://private-anon-022f9273e-akamaiopen2lunaconfiggtmproduction.apiary-mock.com/config-gtm/v1/domains/example.akadns.net/properties/www', data=values, headers=headers)
request.get_method = lambda: 'PUT'

response_body = urlopen(request).read()
print response_body
