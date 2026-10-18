package io.github.kotlinmania.acceleratesrc

/**
 * Source of BLAS and LAPACK via the Accelerate framework.
 *
 * This package provides linkage to Apple's Accelerate framework on supported platforms.
 */
public object AccelerateSrc {
    /**
     * Name of the native framework linked by this package.
     */
    public const val FRAMEWORK_NAME: String = "Accelerate"
}
