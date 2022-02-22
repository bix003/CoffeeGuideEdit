package com.example.coffeeguide



class Ratio {
    private var title: String? = null
    private var description: String? = null
    private var photo = 0

    constructor() {}
    constructor(title: String?, description: String?, photo: Int) {
        this.title = title
        this.description = description
        this.photo = photo
    }
}