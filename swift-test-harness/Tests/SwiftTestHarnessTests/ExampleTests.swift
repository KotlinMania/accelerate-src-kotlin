#if canImport(Testing)
import Testing
import AccelerateSrc

@Suite("AccelerateSrc Swift Export Tests")
struct AccelerateSrcExportTests {
    @Test("AccelerateSrc swift module imported cleanly")
    func testSwiftModuleLoads() throws {
        #expect(Bool(true), "AccelerateSrc swift module imported cleanly")
    }
}
#elseif canImport(XCTest)
import XCTest
import AccelerateSrc

final class AccelerateSrcExportTests: XCTestCase {
    func testSwiftModuleLoads() throws {
        XCTAssertTrue(true, "AccelerateSrc swift module imported cleanly")
    }
}
#endif
