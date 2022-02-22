package com.example.coffeeguide



 class Varieties {
    public var title: String? = null
    public var description: String? = null
    public var photo = 0

    constructor() {}
    constructor(title: String?, description: String?, photo: Int) {
        this.title = title
        this.description = description
        this.photo = photo
    }
}