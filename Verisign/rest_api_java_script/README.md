# Managed DNS RESTful API Documentation

Browser and node module for making API requests against [Managed DNS RESTful API Documentation](../api).

**Please note: This module uses [Popsicle](https://github.com/blakeembrey/popsicle) to make API requests. Promises must be supported or polyfilled on all target environments.**

## Installation

```
npm install managed-dns-restful-api-documentation --save
```

## Usage

```javascript
var ManagedDnsRestfulApiDocumentation = require('managed-dns-restful-api-documentation');

var client = new ManagedDnsRestfulApiDocumentation();
```

### Options

You can set options when you initialize a client or at any time with the `options` property. You may also override options for a single request by passing an object as the second argument of any request method. For example:

```javascript
var client = new ManagedDnsRestfulApiDocumentation({ ... });

client.options = { ... };

client.resource('/').get(null, {
  baseUri: 'http://example.com',
  headers: {
    'Content-Type': 'application/json'
  }
});
```

#### Base URI

You can override the base URI by setting the `baseUri` property, or initializing a client with a base URI. For example:

```javascript
new ManagedDnsRestfulApiDocumentation({
  baseUri: 'https://example.com'
});
```

#### Base URI Parameters

If the base URI has parameters inline, you can set them by updating the `baseUriParameters` property. For example:

```javascript
client.options.baseUriParameters.version = 'v1';
```

### Resources

All methods return a HTTP request instance of [Popsicle](https://github.com/blakeembrey/popsicle), which allows the use of promises (and streaming in node).

#### resources.v1.accounts.accountId(accountId).move

```js
var resource = client.resources.v1.accounts.accountId(accountId).move;
```

##### POST

Moves the specified account ID under a different parent account ID. This can be called only by Verisign Customer Support users. Please contact Customer Support if you need an account moved.  This resource can be used for following purposes:
1. Converting a direct customer to a reseller customer or reseller affiliate customer by setting new_parent_account_id.
2. Moving a reseller customer or reseller affiliate customer under a different reseller customer or reseller affiliate customer by setting new_parent_account_id.
3. Converting a reseller customer or reseller affiliate customer to direct customer by setting new_parent_account_id as -1.

```js
resource.post().then(function (res) { ... });
```

##### Headers

```javascript
resource.post(null, {
  headers: { ... }
});
```

* **Content-Type** _string_

Should be `application/json`

* **Accept** _string_

Should be `application/json`

##### Body

**application/json**

```
{
  "$schema": "http://json-schema.org/draft-04/schema#",
  "type": "object",
  "properties": {
    "receiving_parent_account_id": {
      "description": "The ID of the account, which the account should be transferred under. For converting the account to a direct customer, set this to -1.",
      "type": "integer"
    }
  },
  "required": [
    "receiving_parent_account_id"
  ]
}

```

#### resources.v1.users.apikeys.my

```js
var resource = client.resources.v1.users.apikeys.my;
```

##### GET

Retrieves the API Key (Token) information for the user.

```js
resource.get().then(function (res) { ... });
```

##### Headers

```javascript
resource.get(null, {
  headers: { ... }
});
```

* **Content-Type** _string_

Should be `application/json`

* **Accept** _string_

Should be `application/json`

##### POST

Creates a new API Key (Token) for the requesting user.

```js
resource.post().then(function (res) { ... });
```

##### Headers

```javascript
resource.post(null, {
  headers: { ... }
});
```

* **Content-Type** _string_

Should be `application/json`

* **Accept** _string_

Should be `application/json`

##### DELETE

Deletes the API Key (Token) for the user.

```js
resource.delete().then(function (res) { ... });
```

##### Headers

```javascript
resource.delete(null, {
  headers: { ... }
});
```

* **Content-Type** _string_

Should be `application/json`

* **Accept** _string_

Should be `application/json`



### Custom Resources

You can make requests to a custom path in the API using the `#resource(path)` method.

```javascript
client.resource('/example/path').get();
```

## License

Apache 2.0
