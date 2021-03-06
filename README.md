# Compose Multi-Module Architecture Sample

Sample project that shows an approach for designing a multi-module architecture for Jetpack Compose Android applications.

## Architecture

<div>
  <img align="center" src="app_arch.png" alt="Architecture" width="640">
</div>

This sample application contains the following feature modules:

- **images** - shows image feed by specific user query.
- **profile** - displays profile details of a specific selected user.
- **data** - provides access to the data layer of the application such as network API and persistence.

The **app** module is considered as a dependency injector and an entry point to the application. It's main purpose is to build the dependency graph
and then delegate execution to other features that are defined in other modules.

In addition, there is a **common** module that contains all the shared code for all other modules.

### Feature structure

<div>
  <img align="center" src="feature_arch.png" alt="Feature Structure" width="640">
</div>

Each **feature** is separated into 2 parts:

- **API** - that defines a set of public interfaces that allow other application components to interact with the feature. No specific implementation
  logic is allowed here.
- **Implementation** - that contains all the internal implementation details of the feature. Other features are not aware of this part. This means
  that any update to the application binary interface (ABI) won't force the build system to rebuild all modules that depend on the feature.
