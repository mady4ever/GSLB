from urllib2 import Request, urlopen

values = """
<load-object domain="example.akadns.net" timestamp="2015-05-01T19:38:53.188Z" version="1" xmlns="http://www.akamai.com/FirstPoint/load-balancing">
    <datacenter datacenterId="100">
        <resource name="connections">
            <current-load>20</current-load>
            <target-load>25</target-load>
            <max-load>30</max-load>
        </resource>
    </datacenter>
</load-object>"""

headers = {
  'Content-Type': 'application/xml'
}
request = Request('http://private-anon-4e8d6e137-akamaiopen2mappinggtmloaddataproduction.apiary-mock.com/gtm-load-data/v1/domain/resource/datacenterId', data=values, headers=headers)

response_body = urlopen(request).read()
print response_body
