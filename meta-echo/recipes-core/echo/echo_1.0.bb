SUMMARY = "UDP echo server"
DESCRIPTION = "Simple UDP echo server"
LICENSE = "CLOSED"
SRC_URI = "git://github.com/vitoTomas/servx-echo.git;branch=main;protocol=https"
SRCREV = "9af2f34680987d1aa55b4773085e4f68f6129241"
S = "${WORKDIR}/git"

inherit autotools
