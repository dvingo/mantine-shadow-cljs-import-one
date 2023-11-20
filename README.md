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
