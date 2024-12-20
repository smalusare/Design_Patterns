# Chain of Responsibility
Chain of responsibility design pattern enables us to send/pass a single request through a series of handlers. Each handler processes it and pass the request to next handler or it can reject/handle the request on its own.

### Way to implement
1. There is an abstract/base class which contains `setNextHandler` and `handle` methods and all other classes inherit from it
2. In main function, set the heirarchy of different handlers
3. Each concrete class should implement the `handle` function

### Example
Following example is of approving a request in a company where we have 3 roles: Manager, Director and CEO. Each role has a budget limit and whenever any one receives a budget request, he/she will either approve the request if budget falls within limit or pass it along the hierarchy.

### Implementation
1. `Approver` abstract class contains `approve` method and has `canApprove` abstract method.
2. Each concrete class i.e Manager, Director and CEO implements `canApprove` method.

### Other Examples
1. A HTTP handler where each request goes through a series of middleware, eg. header checker, token checker, permission checker etc.