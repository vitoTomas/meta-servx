FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://ntp.conf"

do_install:append() {
    # Overwrite NTP package default ntp.conf file
    install -m 0644 ${WORKDIR}/ntp.conf ${D}${sysconfdir}/ntp.conf
}
