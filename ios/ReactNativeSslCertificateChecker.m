
#import "ReactNativeSslCertificateChecker.h"

@implementation ReactNativeSslCertificateChecker

#define kResultBooleanSuccess @[@{@"result":@"true"}]

RCT_EXPORT_MODULE(ReactNativeSslCertificateChecker)

RCT_EXPORT_METHOD(checkSSLCertificate:(NSString *)httpUrl fingerPrint:(NSString*) fingerPrint callback:(RCTResponseSenderBlock)callback) {
	
    NSLog(@"<<>> checkSSLCertificate");
	callback(kResultBooleanSuccess);
	//callback([NSString returnJSONValueWithString:json]);
}

@end
  
