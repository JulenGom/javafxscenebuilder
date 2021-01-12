package ehu.isad.model;

public class UrlModel {
        private String Url;
        private String md5;
        private String version;

        public Integer UrlIzena() {
            return Url;
        }

        public void setUrl(String UrlIzena) {
            this.Url = UrlIzena;
        }

        public String getmd5() {
            return md5;
        }

        public void setMd5(String pMd5) {
            this.md5 = pMd5;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String pVersion) {
            this.version = pVersion;
        }

        public UrlModel(String Url, String md5,String version;) {
            this.Url = Url;
            this.md5 = md5;
            this.version = version;
        }
}
