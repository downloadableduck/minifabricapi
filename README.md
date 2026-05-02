This mod adds a couple of the modules from the [Fabric API](https://modrinth.com/mod/fabric-api) to Neoforge. Specifically:

- Fabric Command API V2
- Fabric Keymapping API V1
- Fabric Networking API V1
  - Be careful when interacting with this pared with Neoforge, it can be unstable in some situations.
- Fabric Rendering API V1
- Fabric API Base
- Fabric Object Builder V1
- Fabric Registry Sync API V2

This mod hopes to ease developing multiplatform mods and allow developers to use Fabric API's code in common code.

<details>
<summary>For Developers (Installation, Setup, Etc)</summary>

Firstly, add Modrinth to your repositories.

```groovy
repositories {
    maven {
        name = "Modrinth"
        url = "https://api.modrinth.com/maven"
    }
}
```

The second step will depend on what kind of project you are making. For the version, check [our versions page](https://modrinth.com/project/minifabricapi/versions).

**Architectury:**

```groovy
dependencies {
    compileOnly "maven.modrinth:minifabricapi:version"
}
```

Note that we use compileOnly since this API is only available for Neoforge. To make sure the sources are provided at runtime, download the mod JAR and drop it into your `neoforge/run/mods` folder. Get the [Fabric API](https://modrinth.com/mod/fabric-api) and drop it into your `fabric/run/mods` folder.

**Basic Neoforge Project:**

```groovy
dependencies {
    implementation "maven.modrinth.minifabricapi:${minifabricapi_version}
}
```

**Always** remember to add this mod as a dependency in your `neoforge.mods.toml` so the game crashes with a clear view of what the user has to do rather than a `NoClassDefFoundError`.

```toml
[[dependencies.${mod_id}]]
    modId="minifabricapi"
    type="required"
    versionRange="${minifabricapi_version}"
    ordering="NONE"
    side="CLIENT"
```

</details>

**How can I contribute?**
If you are just the ordinary player who enjoys modding, hit that download button! The more downloads we get, the more aware other developers will become of this mod. If you are a developer, pull requests on our [GitHub](https://github.com/downloadableduck/minifabricapi) are available. Go ahead and add a module or two, it would be _extremely_ helpful!

Report ANY and ALL issues on my [GitHub](https://github.com/downloadableduck/minifabricapi/issues). I CANNOT STRESS THIS ENOUGH. REPORTING ISSUES IS HOW THIS MOD GETS THEM FIXED. IF YOU WANT AN ISSUE FIXED, REPORT IT.

