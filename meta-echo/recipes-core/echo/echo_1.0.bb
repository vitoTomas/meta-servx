SUMMARY = "UDP echo server"
DESCRIPTION = "Simple UDP echo server"
LICENSE = "CLOSED"
SRC_URI = "git://github.com/vitoTomas/servx-echo.git;branch=main;protocol=https"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

inherit autotools
