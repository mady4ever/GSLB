{
    "$schema" :  "http://json-schema.org/draft-03/schema#",
    "type" : "object",
    "additionalProperties": false,
    "properties" : {
        "leastSquaresDecay" : {
            "type" : ["number", "null"],
            "minimum": 0,
            "maximum": 1
        },
        "hostHeader" : {
            "type" : ["string", "null"],
            "maxLength" : 255
        },
        "description" : {
            "type" : ["string", "null"],
            "maxLength" : 256
        },
        "leaderString" : {
            "type" : ["string", "null"],
            "maxLength" : 256
        },
        "constrainedProperty" : {
            "type" : ["string", "null"],
            "maxLength": 256
        },
        "resourceInstances" : {
            "type" : "array",
            "items" : {
                "type" : "object",
                "properties" : {
                    "datacenterId" : {
                        "type" : "integer",
                        "required": true
                    },
                    "useDefaultLoadObject" : {
                        "type" : "boolean"
                    },
                    "loadServers" : {
                        "type" : "array",
                        "items" : {
                            "type" : "string"
                        }
                    },
                    "loadObject" : {
                        "type" : "string",
                        "maxLength" : 256,
                        "pattern" : "^(?!:).*$"
                    },
                    "loadObjectPort" : {
                        "type" : "integer",
                        "minimum": 0,
                        "maximum": 65535
                    }
                }
            }
        },
        "aggregationType" : {
            "type" : "string",
            "maxLength": 15,
            "required" : true,
            "enum" :  ["sum", "median", "latest"]
        },
        "links" : {
            "type" : "array",
            "items" : {
                "type" : "object",
                "properties" : {
                    "rel" : {
                        "type" : "string"
                    },
                    "href" : {
                        "type" : "string"
                    }
                }
            }
        },
        "loadImbalancePercentage" : {
            "type" : ["number", "null"],
            "minimum": 0,
            "maximum": 1000000
        },
        "type" : {
            "type" : "string",
            "required" : true,
            "enum" :  ["XML load object via HTTP", "XML load object via HTTPS", "Non-XML load object via HTTP", "Non-XML load object via HTTPS", "Download score"]
        },
        "upperBound" : {
            "type" : ["integer", "null"]
        },
        "name" : {
            "type" : "string",
            "required": true,
            "maxLength": 150,
            "pattern" : "^((?!\\s).)*$"
        },
        "maxUMultiplicativeIncrement" : {
            "type" : ["number", "null"],
            "minimum" : 1.0
        },
        "decayRate" : {
            "type" : ["number", "null"],
            "minimum": 0,
            "maximum": 1
        }
    }
}
