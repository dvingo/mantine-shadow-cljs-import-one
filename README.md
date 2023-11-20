This repo demonstrates attempting to load specific js modules from 
https://mantine.dev/getting-started/

as described under this section:

https://shadow-cljs.github.io/docs/UsersGuide.html#_using_npm_packages

The goal is to not load the entire library (~500kb) but only the components used.

# Run the shadow-version

```bash
npm i
npm run watch
```

You will see the compilation failure.

```
package @mantine/core had exports, but could not resolve ./cjs/core/MantineProvider/MantineProvider
{:package #object[java.io.File 0x89fce71 "/home/user/shadow-cljs-mantine/node_modules/@mantine/core"], :require-from nil, :rel-require "./cjs/core/MantineProvider/MantineProvider"}
ExceptionInfo: package @mantine/core had exports, but could not resolve ./cjs/core/MantineProvider/MantineProvider
```
