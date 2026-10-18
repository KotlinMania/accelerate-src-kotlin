# accelerate-src-kotlin in Kotlin

[![GitHub link](https://img.shields.io/badge/GitHub-KotlinMania%2Faccelerate-src-kotlin-blue.svg)](https://github.com/KotlinMania/accelerate-src-kotlin)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.kotlinmania/accelerate-src-kotlin)](https://central.sonatype.com/artifact/io.github.kotlinmania/accelerate-src-kotlin)
[![Build status](https://img.shields.io/github/actions/workflow/status/KotlinMania/accelerate-src-kotlin/ci.yml?branch=main)](https://github.com/KotlinMania/accelerate-src-kotlin/actions)

This is a Kotlin Multiplatform line-by-line transliteration port of [`accelerate-src`](https://github.com/huggingface/candle).

**Original Project:** This port is based on [`accelerate-src`](https://github.com/huggingface/candle). All design credit and project intent belong to the upstream authors; this repository is a faithful port to Kotlin Multiplatform with no behavioural changes intended.

### Porting status

This is an **in-progress port**. The goal is feature parity with the upstream Rust crate while providing a native Kotlin Multiplatform API. Every Kotlin file carries a `// port-lint: source <path>` header naming its upstream Rust counterpart so the AST-distance tool can track provenance.

---

## Upstream README — `accelerate-src`

> The text below is reproduced from [`https://github.com/huggingface/candle`](https://github.com/huggingface/candle). It is the upstream project's own description and remains under the upstream authors' authorship; links have been rewritten to absolute upstream URLs where appropriate so they continue to resolve from this repository.

# accelerate-src [![Package][package-img]][package-url] [![Documentation][documentation-img]][documentation-url] [![Build][build-img]][build-url]

The package provides a source of [BLAS] and [LAPACK] via the [Accelerate]
framework.

The usage of the package is explained [here][usage].

## Contribution

Your contribution is highly appreciated. Do not hesitate to open an issue or a
pull request. Note that any contribution submitted for inclusion in the project
will be licensed according to the terms given in [LICENSE.md](LICENSE.md).

[accelerate]: https://developer.apple.com/documentation/accelerate
[blas]: https://en.wikipedia.org/wiki/BLAS
[lapack]: https://en.wikipedia.org/wiki/LAPACK
[usage]: https://blas-lapack-rs.github.io/usage

[build-img]: https://travis-ci.org/blas-lapack-rs/accelerate-src.svg?branch=master
[build-url]: https://travis-ci.org/blas-lapack-rs/accelerate-src
[documentation-img]: https://docs.rs/accelerate-src/badge.svg
[documentation-url]: https://docs.rs/accelerate-src
[package-img]: https://img.shields.io/crates/v/accelerate-src.svg
[package-url]: https://crates.io/crates/accelerate-src

---

## About this Kotlin port

### Installation

```kotlin
dependencies {
    implementation("io.github.kotlinmania:accelerate-src-kotlin:0.3.2")
}
```

### Building

```bash
./gradlew build
./gradlew test
```

### Targets

- macOS arm64
- Linux x64
- Windows mingw-x64
- iOS arm64 / simulator-arm64 (Swift export + XCFramework)
- JS (browser + Node.js)
- Wasm-JS (browser + Node.js)
- Android (API 24+)

### Porting guidelines

See [AGENTS.md](AGENTS.md) and [CLAUDE.md](CLAUDE.md) for translator discipline, port-lint header convention, and Rust → Kotlin idiom mapping.

### License

This Kotlin port is distributed under the same license terms as the upstream [`accelerate-src`](https://github.com/huggingface/candle). See [LICENSE](LICENSE) (and any sibling `LICENSE-*` / `NOTICE` files mirrored from upstream) for the full text.

Original work copyrighted by the accelerate-src authors.  
Kotlin port: Copyright (c) 2026 Sydney Renee and The Solace Project.

### Acknowledgments

Thanks to the [`accelerate-src`](https://github.com/huggingface/candle) maintainers and contributors for the original Rust implementation. This port reproduces their work in Kotlin Multiplatform; bug reports about upstream design or behavior should go to the upstream repository.
