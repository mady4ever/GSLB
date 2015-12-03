from urllib2 import Request, urlopen

values = """
  {
    "cidrMaps": [
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
        },
        "name": "The North"
      }
    ],
    "datacenters": [
      {
        "city": "Doune",
        "cloneOf": 0,
        "continent": "EU",
        "country": "GB",
        "datacenterId": 3133,
        "defaultLoadObject": {
          "loadObject": null,
          "loadObjectPort": 0,
          "loadServers": null
        },
        "latitude": 56.185097,
        "longitude": -4.050264,
        "nickname": "Winterfell",
        "stateOrProvince": "Perthshire",
        "virtual": true
      },
      {
        "city": "Winterfell",
        "cloneOf": 0,
        "continent": "EU",
        "country": "IS",
        "datacenterId": 3134,
        "defaultLoadObject": {
          "loadObject": null,
          "loadObjectPort": 0,
          "loadServers": null
        },
        "latitude": 64.808,
        "longitude": -23.776,
        "nickname": "Frostfangs",
        "stateOrProvince": null,
        "virtual": true
      },
      {
        "city": null,
        "cloneOf": 0,
        "continent": null,
        "country": null,
        "datacenterId": 5400,
        "defaultLoadObject": {
          "loadObject": null,
          "loadObjectPort": 0,
          "loadServers": null
        },
        "latitude": 0,
        "longitude": 0,
        "nickname": "Default Datacenter",
        "stateOrProvince": null,
        "virtual": true
      }
    ],
    "defaultSslClientCertificate": null,
    "defaultSslClientPrivateKey": null,
    "defaultUnreachableThreshold": null,
    "emailNotificationList": [],
    "geographicMaps": [
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
        },
        "name": "UK Delivery"
      }
    ],
    "lastModified": "2014-04-08T18:25:51.000+0000",
    "lastModifiedBy": "admin@example.com",
    "loadFeedback": true,
    "loadImbalancePercentage": 10,
    "minPingableRegionFraction": null,
    "modificationComments": "CIDRMap example",
    "name": "example.akadns.net",
    "pingInterval": null,
    "properties": [
      {
        "backupCName": null,
        "backupIp": null,
        "balanceByDownloadScore": false,
        "cname": null,
        "comments": null,
        "dynamicTTL": 300,
        "failbackDelay": 0,
        "failoverDelay": 0,
        "handoutMode": "normal",
        "healthMax": null,
        "healthMultiplier": null,
        "healthThreshold": null,
        "ipv6": false,
        "lastModified": "2014-04-08T18:25:52.000+0000",
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
        "mapName": null,
        "maxUnreachablePenalty": null,
        "mxRecords": [],
        "name": "www",
        "scoreAggregationType": "mean",
        "staticTTL": 600,
        "stickinessBonusConstant": 0,
        "stickinessBonusPercentage": 0,
        "trafficTargets": [
          {
            "datacenterId": 5400,
            "enabled": false,
            "handoutCName": null,
            "name": null,
            "servers": [],
            "weight": 0
          },
          {
            "datacenterId": 3134,
            "enabled": true,
            "handoutCName": null,
            "name": null,
            "servers": [
              "1.2.3.5"
            ],
            "weight": 0
          },
          {
            "datacenterId": 3133,
            "enabled": true,
            "handoutCName": null,
            "name": null,
            "servers": [
              "1.2.3.4"
            ],
            "weight": 1
          }
        ],
        "type": "failover",
        "unreachableThreshold": null,
        "useComputedTargets": false
      },
      {
        "backupCName": null,
        "backupIp": null,
        "balanceByDownloadScore": false,
        "cname": null,
        "comments": null,
        "dynamicTTL": 300,
        "failbackDelay": 0,
        "failoverDelay": 0,
        "handoutMode": "normal",
        "healthMax": null,
        "healthMultiplier": null,
        "healthThreshold": null,
        "ipv6": true,
        "lastModified": "2014-04-08T18:25:52.000+0000",
        "livenessTests": [],
        "mapName": null,
        "maxUnreachablePenalty": null,
        "mxRecords": [],
        "name": "mail",
        "scoreAggregationType": "mean",
        "staticTTL": 600,
        "stickinessBonusConstant": 0,
        "stickinessBonusPercentage": 0,
        "trafficTargets": [
          {
            "datacenterId": 5400,
            "enabled": false,
            "handoutCName": null,
            "name": null,
            "servers": [],
            "weight": 1
          },
          {
            "datacenterId": 3134,
            "enabled": true,
            "handoutCName": null,
            "name": null,
            "servers": [
              "2001:4878::5043:4078"
            ],
            "weight": 1
          },
          {
            "datacenterId": 3133,
            "enabled": true,
            "handoutCName": null,
            "name": null,
            "servers": [
              "2001:4878::5043:4072",
              "2001:4878::5043:4071"
            ],
            "weight": 1
          }
        ],
        "type": "weighted-round-robin",
        "unreachableThreshold": null,
        "useComputedTargets": false
      },
      {
        "backupCName": null,
        "backupIp": null,
        "balanceByDownloadScore": false,
        "cname": null,
        "comments": null,
        "dynamicTTL": 300,
        "failbackDelay": 0,
        "failoverDelay": 0,
        "handoutMode": "normal",
        "healthMax": null,
        "healthMultiplier": null,
        "healthThreshold": null,
        "ipv6": false,
        "lastModified": "2014-04-08T18:25:52.000+0000",
        "livenessTests": [],
        "loadImbalancePercentage": null,
        "mapName": null,
        "maxUnreachablePenalty": null,
        "mxRecords": [],
        "name": "supplies",
        "scoreAggregationType": "mean",
        "staticTTL": 600,
        "stickinessBonusConstant": 0,
        "stickinessBonusPercentage": 0,
        "trafficTargets": [
          {
            "datacenterId": 5400,
            "enabled": true,
            "handoutCName": "supplies.example.com",
            "name": null,
            "servers": [],
            "weight": 1
          },
          {
            "datacenterId": 3134,
            "enabled": true,
            "handoutCName": "winter.supplies.example.com",
            "name": null,
            "servers": [],
            "weight": 0
          },
          {
            "datacenterId": 3133,
            "enabled": true,
            "handoutCName": "redcross.org",
            "name": null,
            "servers": [],
            "weight": 0
          }
        ],
        "type": "failover",
        "unreachableThreshold": null,
        "useComputedTargets": false
      },
      {
        "backupCName": null,
        "backupIp": null,
        "balanceByDownloadScore": false,
        "cname": null,
        "comments": null,
        "dynamicTTL": 300,
        "failbackDelay": 0,
        "failoverDelay": 0,
        "handoutMode": "normal",
        "healthMax": null,
        "healthMultiplier": null,
        "healthThreshold": null,
        "ipv6": false,
        "lastModified": "2014-04-08T18:25:52.000+0000",
        "livenessTests": [],
        "loadImbalancePercentage": null,
        "mapName": "UK Delivery",
        "maxUnreachablePenalty": null,
        "mxRecords": [],
        "name": "shop",
        "scoreAggregationType": "mean",
        "staticTTL": 600,
        "stickinessBonusConstant": 0,
        "stickinessBonusPercentage": 0,
        "trafficTargets": [
          {
            "datacenterId": 5400,
            "enabled": true,
            "handoutCName": "shop.example.com",
            "name": null,
            "servers": [],
            "weight": 1
          },
          {
            "datacenterId": 3134,
            "enabled": false,
            "handoutCName": null,
            "name": null,
            "servers": [],
            "weight": 1
          },
          {
            "datacenterId": 3133,
            "enabled": true,
            "handoutCName": "uk.shop.example.com",
            "name": null,
            "servers": [],
            "weight": 1
          }
        ],
        "type": "geographic",
        "unreachableThreshold": null,
        "useComputedTargets": false
      }
    ],
    "resources": [
      {
        "aggregationType": "latest",
        "constrainedProperty": "mail",
        "decayRate": null,
        "description": "CPU utilization",
        "hostHeader": null,
        "leaderString": null,
        "leastSquaresDecay": null,
        "loadImbalancePercentage": null,
        "maxUMultiplicativeIncrement": null,
        "name": "cpu",
        "resourceInstances": [
          {
            "datacenterId": 3134,
            "loadObject": "/cpu",
            "loadObjectPort": 80,
            "loadServers": [
              "1.2.3.8"
            ],
            "useDefaultLoadObject": false
          },
          {
            "datacenterId": 3133,
            "loadObject": "/cpu",
            "loadObjectPort": 80,
            "loadServers": [
              "1.2.3.7"
            ],
            "useDefaultLoadObject": false
          },
          {
            "datacenterId": 5400,
            "loadObject": null,
            "loadObjectPort": 0,
            "loadServers": [],
            "useDefaultLoadObject": false
          }
        ],
        "type": "XML load object via HTTP",
        "upperBound": 0
      },
      {
        "aggregationType": "latest",
        "constrainedProperty": "**",
        "decayRate": null,
        "description": "Supply levels of Arbor Gold",
        "hostHeader": null,
        "leaderString": null,
        "leastSquaresDecay": null,
        "loadImbalancePercentage": null,
        "maxUMultiplicativeIncrement": null,
        "name": "arbor-gold",
        "resourceInstances": [
          {
            "datacenterId": 3134,
            "loadObject": "/cups",
            "loadObjectPort": 80,
            "loadServers": [
              "1.2.3.8"
            ],
            "useDefaultLoadObject": false
          },
          {
            "datacenterId": 3133,
            "loadObject": "/cups",
            "loadObjectPort": 80,
            "loadServers": [
              "1.2.3.7"
            ],
            "useDefaultLoadObject": false
          },
          {
            "datacenterId": 5400,
            "loadObject": null,
            "loadObjectPort": 0,
            "loadServers": [],
            "useDefaultLoadObject": false
          }
        ],
        "type": "Non-XML load object via HTTP",
        "upperBound": 0
      }
    ],
    "roundRobinPrefix": null,
    "servermonitorLivenessCount": null,
    "servermonitorLoadCount": null,
    "type": "full"
  }
"""

headers = {
  'Content-Type': 'application/json'
}
request = Request('http://private-anon-022f9273e-akamaiopen2lunaconfiggtmproduction.apiary-mock.com/config-gtm/v1/domains/example.akadns.net', data=values, headers=headers)
request.get_method = lambda: 'PUT'

response_body = urlopen(request).read()
print response_body
