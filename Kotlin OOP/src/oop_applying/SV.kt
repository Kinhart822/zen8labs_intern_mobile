package oop_applying

import java.util.*

class SV(private var namSinh: Date?) {
    public var NamSinh: Date?
        get() {
            return namSinh
        }
        set(value) {
            namSinh = value
        }

}