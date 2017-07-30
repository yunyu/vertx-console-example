vertx-console-example
==

Example page for [Vert.x Console](https://github.com/yunyu/vertx-console). This uses [frontend-maven-plugin](https://github.com/eirslett/frontend-maven-plugin) to run `yarn` and `webpack`, then copies the frontend bundle as a Maven resource.

![](https://i.imgur.com/OUWk6Bl.png)

Usage
==

* To install locally: `mvn clean install`
* To run dev session (after installing system-wide Node.js and Yarn, and starting a webserver with `ExampleConsolePage` mounted on a console with path `/admin` running on `localhost:5000`):

```
	cd frontend
	yarn
	yarn run dev
```

TODO
==

* Clearly document where things should be replaced
* Better documentation for running dev session
* Potentially figure out how to remove `base.js` from `frontend/` and use the latest version from NPM/dependency JAR for dev session