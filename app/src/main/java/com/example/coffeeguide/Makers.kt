package com.example.coffeeguide


class Makers {
    public var title: String? = null
    public var description: String? = null
    public var description2: String? = null
    public var description3: String? = null
    public var description4: String? = null
    public var description5: String? = null
    public var photo = 0


    constructor(
        title: String?,
        description: String?,
        description2: String?,
        description3: String?,
        description4: String?,
        description5: String?,
        photo: Int
    ) {
        this.title = title
        this.description = description
        this.description2 = description2
        this.description3 = description3
        this.description4 = description4
        this.description5 = description5
        this.photo = photo
    }
}