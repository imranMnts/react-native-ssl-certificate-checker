import { NativeModules } from 'react-native';

const { ReactNativeSslCertificateChecker } = NativeModules;

export function checkSSLCertificate(url: string, fingerPrint: string): any {
  ReactNativeSslCertificateChecker.checkSSLCertificate(url, fingerPrint, (response: any) => {
    console.warn('<<>> response : ', response);
  });
}
