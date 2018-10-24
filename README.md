Showcase an issue on map property binding with Micronaut. 
For a property whose type is `Map<String, Map<String, Something>>` we are losing the second map's generic types at runtime. 

Check the test `PropertiesTest#test()` for a use-case. See the application.yml for the configuration.


